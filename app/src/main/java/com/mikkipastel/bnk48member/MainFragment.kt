package com.mikkipastel.bnk48member

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mikkipastel.bnk48member.adapter.MemberAdapter
import com.mikkipastel.bnk48member.adapter.MemberListener
import com.mikkipastel.bnk48member.databinding.FragmentMainBinding
import com.mikkipastel.bnk48member.model.ListMemberItem
import com.mikkipastel.bnk48member.model.Member
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment(), MemberListener {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(layoutInflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val memberList = getDataFromJson()

        val memberAdapter = MemberAdapter(memberList, this)

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
            isNestedScrollingEnabled = false
            adapter = memberAdapter
            onFlingListener = null
        }

        memberAdapter.notifyDataSetChanged()

    }

    private fun getDataFromJson(): ArrayList<Member> {
        val inputStream = activity!!.assets.open("bnk48member.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer, charset("UTF-8"))
        val listType = object : TypeToken<ListMemberItem>() {}.type
        val gson = Gson().fromJson<ListMemberItem>(json, listType)
        return gson.members
    }

    override fun onItemClick() {

    }

}
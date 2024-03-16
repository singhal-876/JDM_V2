package com.abhinav.jdm_v2.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abhinav.jdm_v2.R
import com.abhinav.jdm_v2.adapter.DashboardRecyclerAdapter


class DashboardFragment : Fragment() {

    private lateinit var recyclerDashboard: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var recyclerAdapter: DashboardRecyclerAdapter

    private val carsList= arrayListOf(
        "BMW M3",
        "GTR R34",
        "Supra MK4",
        "Honda NSX",
        "Mazda RX7",
        "Trueno AE86",
        "Silvia 240SX",
        "Subaru Impreza",
        "Honda Civic Type R",
        "Mitsubishi Lancer Evo X"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        recyclerDashboard=view.findViewById(R.id.recyclerview)
        layoutManager=LinearLayoutManager(activity)
        recyclerAdapter= DashboardRecyclerAdapter(activity as Context, carsList)

        recyclerDashboard.adapter = recyclerAdapter
        recyclerDashboard.layoutManager = layoutManager
        return view
    }

}
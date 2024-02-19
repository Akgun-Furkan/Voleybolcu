package com.agn.superkahramanbtk

import android.graphics.Bitmap
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val voleybolList:ArrayList<String>,val voleybolGörsel:ArrayList<Bitmap>):RecyclerView.Adapter<RecyclerAdapter.SuperkVoleybolVH>() {
    class SuperkVoleybolVH {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperkVoleybolVH {

    }

    override fun getItemCount(): Int {

        return voleybolList.size
    }

    override fun onBindViewHolder(holder: SuperkVoleybolVH, position: Int) {


    }
}
package com.agn.superkahramanbtk

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agn.superkahramanbtk.databinding.RecyclerRowBinding


class RecyclerAdapter(val voleybolList:ArrayList<String>, val voleybolGorsel:ArrayList<Int>):RecyclerView.Adapter<RecyclerAdapter.SuperkVoleybolVH>() {
    private lateinit var binding:RecyclerRowBinding

    class SuperkVoleybolVH(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperkVoleybolVH {


        //xml ve bir kodu bağlamak için Inflater,LyoutInflater,MenuInflater
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperkVoleybolVH(itemView)

    }

    override fun getItemCount(): Int {

        return voleybolList.size
    }

    override fun onBindViewHolder(holder: SuperkVoleybolVH, position: Int) {

        //holder.itemView.recycler1.text=voleybolList.get(position)
        val currentItem = voleybolList[position]
        val currentBitmap = voleybolGorsel[position]

        val binding = RecyclerRowBinding.bind(holder.itemView)
        binding.recycler1.text = currentItem
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("voleybolcu",voleybolList.get(position))

            /*val singelton=SingletonClass.SecilenVoleybolcu
            singelton.gorsel=currentBitmap*/
            intent.putExtra("voleybolGörsel",voleybolGorsel.get(position))


            holder.itemView.context.startActivity(intent)
        }
        // Görseli ayarlamak için:
        // binding.imageView.setImageBitmap(currentBitmap)


    }
}
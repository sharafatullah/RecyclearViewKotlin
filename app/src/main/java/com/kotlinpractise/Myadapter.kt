package com.kotlinpractise

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.items.view.*

class Myadapter(val arraylist : ArrayList<Models1>, val context:Context) : RecyclerView.Adapter<Myadapter.Myviewholder>() {

//    public var OnitemClick1:OnitemClick = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Myviewholder {
        return Myviewholder(LayoutInflater.from(context).inflate(R.layout.items,parent,false));
    }


    interface OnitemClick {
        fun itemclick(view:View,position:Int)
    }

//    fun SettingAdapter(myOnitemClick1:OnitemClick){
//        this.OnitemClick1 = myOnitemClick1
//    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: Myviewholder?, position: Int) {

        holder?.image?.setBackgroundResource(arraylist[position].drawable)
    }

    class Myviewholder(view : View) : RecyclerView.ViewHolder(view)  {
        val image = view.image

    }
}
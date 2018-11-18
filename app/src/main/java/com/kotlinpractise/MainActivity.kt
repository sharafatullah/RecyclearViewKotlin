package com.kotlinpractise


import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //initilizing the arraylist
    var arraylist:ArrayList<Models1> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initilizing the views
        initview();

        if(arraylist.size > 0){
            SettingAdapter(arraylist)
        }else{
            SettingAdapter(InsertData())
        }
    }

    fun initview(){
        recyclearview.addOnItemClickListener(object: OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {
                val intent = Intent(this@MainActivity,Details::class.java)
                var bundle:Bundle = Bundle()
                bundle.putSerializable("data",arraylist[position])
                intent.putExtra("bundle",bundle)
                startActivity(intent)
            }
        })
    }

    fun InsertData() : ArrayList<Models1>{
        arraylist.clear();
        arraylist.add(Models1("1","one","Mysunset",R.drawable.one))
        arraylist.add(Models1("2","two","Mysunset",R.drawable.two))
        arraylist.add(Models1("3","three","Mysunset",R.drawable.three))
        arraylist.add(Models1("4","four","Mysunset",R.drawable.four))
        arraylist.add(Models1("5","five","Mysunset",R.drawable.five))
        arraylist.add(Models1("6","six","Mysunset",R.drawable.six))
        arraylist.add(Models1("7","seven","Mysunset",R.drawable.seven))
        arraylist.add(Models1("8","eight","Mysunset",R.drawable.eight))
        arraylist.add(Models1("9","nine","Mysunset",R.drawable.nine))
        arraylist.add(Models1("10","ten","Mysunset",R.drawable.ten))
        return arraylist
    }

    interface OnItemClickListener {
        fun onItemClicked(position: Int, view: View)
    }

    fun RecyclerView.addOnItemClickListener(onClickListener: OnItemClickListener) {
        this.addOnChildAttachStateChangeListener(object: RecyclerView.OnChildAttachStateChangeListener {
            override fun onChildViewDetachedFromWindow(view: View?) {
                view?.setOnClickListener(null)
            }

            override fun onChildViewAttachedToWindow(view: View?) {
                view?.setOnClickListener {
                    val holder = getChildViewHolder(view)
                    onClickListener.onItemClicked(holder.adapterPosition, view)
                }
            }
        })
    }

    fun SettingAdapter(arrayList: ArrayList<Models1>){
        recyclearview.layoutManager = GridLayoutManager(this,2)
        recyclearview.adapter = Myadapter(arraylist,this)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}

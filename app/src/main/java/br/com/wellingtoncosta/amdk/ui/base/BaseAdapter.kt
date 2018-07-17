package br.com.wellingtoncosta.amdk.ui.base

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * @author Wellington Costa on 31/12/2017.
 */
abstract class BaseAdapter<out T>(val list: List<T>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return onCreateViewHolderBase(parent, viewType)
    }

    abstract fun onCreateViewHolderBase(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        onBindViewHolderBase(holder, position)
    }

    abstract fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int)

    override fun getItemCount(): Int {
        return if (list.isNotEmpty()) list.size else 0
    }

    fun getDataList(): List<T> {
        return list
    }

}
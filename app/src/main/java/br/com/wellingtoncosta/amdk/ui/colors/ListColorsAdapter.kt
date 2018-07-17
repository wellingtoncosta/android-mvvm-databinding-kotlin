package br.com.wellingtoncosta.amdk.ui.colors

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.wellingtoncosta.amdk.R
import br.com.wellingtoncosta.amdk.domain.model.Color
import br.com.wellingtoncosta.amdk.ui.base.BaseAdapter

/**
 * @author Wellington Costa on 31/12/2017.
 */
class ListColorsAdapter constructor(list: List<Color>) : BaseAdapter<Color>(list) {

    override fun onCreateViewHolderBase(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ListColorsViewHolder(LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.list_colors_item, parent, false))
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as ListColorsViewHolder).binding
        val color = list[position]
        binding?.color = color
    }

}
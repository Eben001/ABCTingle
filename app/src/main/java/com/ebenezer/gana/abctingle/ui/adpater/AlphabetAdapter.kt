package com.ebenezer.gana.abctingle.ui.adpater

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ebenezer.gana.abctingle.databinding.ListItemAbcBinding
import com.ebenezer.gana.abctingle.model.Alphabet

class AlphabetAdapter(private val listener: (Alphabet) -> Unit) :
    androidx.recyclerview.widget.ListAdapter<Alphabet,
            AlphabetAdapter.ViewHolder>(DiffCallback()) {


    inner class ViewHolder(val binding: ListItemAbcBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private lateinit var alphabet: Alphabet


        init {
            itemView.setOnClickListener {
                listener.invoke(getItem(adapterPosition))

            }
        }

        fun bind(alphabet: Alphabet) {
            this.alphabet = alphabet
            binding.tvAlphabet.text = alphabet.name
            binding.tvAlphabet.setTextColor(Color.WHITE)

            if (adapterPosition % 3 == 0) {
                binding.parentLayout.setBackgroundColor(Color.parseColor("#5E97F6"))

            } else if(adapterPosition % 3 == 1) {
                binding.parentLayout.setBackgroundColor(Color.parseColor("#ADDB34D4"))

            }else{
                binding.tvAlphabet.setTextColor(Color.parseColor("#5E97F6"))
                binding.parentLayout.setBackgroundColor(Color.parseColor("#DAFFD600"))

            }

/*            val random = Random.nextInt(0, 5)
            val draw = GradientDrawable()
            draw.shape = GradientDrawable.RECTANGLE

            val remainder = adapterPosition % AlphabetStore.colors.size
            draw.setColor(Color.parseColor(AlphabetStore.colors[random]))
            binding.parentLayout.setBackgroundColor(Color.parseColor(AlphabetStore.colors[remainder]))*/


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemAbcBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class DiffCallback : DiffUtil.ItemCallback<Alphabet>() {

    override fun areItemsTheSame(oldItem: Alphabet, newItem: Alphabet): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Alphabet, newItem: Alphabet): Boolean {
        return oldItem == newItem
    }

}

package com.ebenezer.gana.abctingle.ui.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.ebenezer.gana.abctingle.R
import com.ebenezer.gana.abctingle.databinding.ActivityMainBinding
import com.ebenezer.gana.abctingle.ui.adpater.AlphabetAdapter
import com.ebenezer.gana.abctingle.utils.AlphabetStore
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AlphabetStore.initializeSound(this)


        binding.rvAlphabets.layoutManager = GridLayoutManager(this, 4)

        /* binding.rvAlphabets.adapter =
             AlphabetAdapter(applicationContext, AlphabetStore.getAllAlphabets())*/

        binding.rvAlphabets.adapter = AlphabetAdapter {

            when (it.id) {
                1 -> {
                    AlphabetStore.playC()
                }
                2 -> {
                    AlphabetStore.playC()
                }
                3 -> {
                    AlphabetStore.playG()
                }
                4 -> {
                    AlphabetStore.playG()

                }

                5 -> {
                    AlphabetStore.playA()

                }

                6 -> {
                    AlphabetStore.playA()

                }

                7 -> {
                    AlphabetStore.playG()

                }

                8 -> {
                    AlphabetStore.playF()

                }
                9 -> {
                    AlphabetStore.playF()

                }

                10 -> {
                    AlphabetStore.playE()

                }

                11 -> {
                    AlphabetStore.playE()

                }

                12 -> {
                    AlphabetStore.playD()

                }
                13 -> {
                    AlphabetStore.playD()

                }

                14 -> {
                    AlphabetStore.playD()

                }

                15 -> {
                    AlphabetStore.playD()

                }

                16 -> {
                    AlphabetStore.playC()

                }

                17 -> {
                    AlphabetStore.playG()

                }

                18 -> {
                    AlphabetStore.playG()

                }

                19 -> {
                    AlphabetStore.playF()

                }

                20 -> {
                    AlphabetStore.playF()

                }

                21 -> {
                    AlphabetStore.playE()

                }

                22 -> {
                    AlphabetStore.playD()

                }

                23 -> {
                    AlphabetStore.playG()

                }

                24 -> {
                    AlphabetStore.playF()

                }

                25 -> {
                    AlphabetStore.playE()

                }

                26 -> {
                    AlphabetStore.playD()

                }


            }
        }
        binding.rvAlphabets.setHasFixedSize(true)


        (binding.rvAlphabets.adapter as AlphabetAdapter).submitList(AlphabetStore.getAllAlphabets())


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> {
                showAlertDialog()
            }
        }
        return super.onOptionsItemSelected(item)

    }

    private fun showAlertDialog() {
        MaterialAlertDialogBuilder(this@MainActivity)
            .setTitle(resources.getString(R.string.dialog_title))
            .setMessage(resources.getString(R.string.dialog_message))
            .setPositiveButton(resources.getString(R.string.ok_dialog_message)) { dialog, _ ->
                dialog.dismiss()

            }
            .show()

    }

}
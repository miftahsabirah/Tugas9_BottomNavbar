package com.example.tugas9_bottomnavbar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.tugas9_bottomnavbar.databinding.FragmentProfilBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfilFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfilFragment : Fragment() {
    // membuat fragment binding
    private lateinit var binding: FragmentProfilBinding

    // mendefinisikan variable untuk menyimpan komponen nantinya
    private lateinit var logoutButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // membuat binding
        binding = FragmentProfilBinding.inflate(inflater, container, false)
        val view = binding.root

// mendefinisikan komponen dengan binding
        logoutButton = binding.logoutButton

        // set onclick listener ketika logout button dipencet
        logoutButton.setOnClickListener{
            // intent untuk logout
            val intenttoLoginActivity = Intent(context, LoginActivity::class.java)
            startActivity(intenttoLoginActivity)
        }
        return view
    }
}
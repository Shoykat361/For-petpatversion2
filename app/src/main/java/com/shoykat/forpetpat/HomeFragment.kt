package com.shoykat.forpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.shoykat.forpetpat.databinding.FragmentHomeBinding

class HomeFragment() : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottomNavMenu)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.ExploreMenu -> {
                    val fragment1 = ExploreFragment()
                    replaceFracment(fragment1)

                    true
                }
                R.id.favoritesMenu -> {
                    val fragment1 = FilterFragment()
                   replaceFracment(fragment1)

                    true

                }
                R.id.ordersMenu -> {
                    val fragment1 = OrderFragment()
                    replaceFracment(fragment1)

                    true
                }
                R.id.accountsMenu -> {
                    val fragment1 = AccountFragment()
                    replaceFracment(fragment1)

                    true
                }
                else -> false
            }
        }

    }
    private fun replaceFracment(fragment: Fragment){
        val fragmentManager = childFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_fragment,fragment)
        fragmentTransaction.commit()
    }

}



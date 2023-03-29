package com.aditya.kitchengenius.presentation.fragment.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.aditya.kitchengenius.databinding.FragmentOnboardingBinding


class OnboardingFragment : Fragment() {

    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideToolbar()
    }

    private fun hideToolbar() {
        val activity = requireActivity() as AppCompatActivity
        activity.supportActionBar?.hide()
    }

    //:TODO still nessesary
//    private fun hideBottomMenu(){
//        val activity = requireActivity() as AppCompatActivity
//        val bottomNavigationView = activity.findViewById<BottomNavigationView>(R.id.bottomMenuNav)
//        bottomNavigationView.visibility = View.GONE
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        hideBottomMenu()

//        binding.getStartedButton.setOnClickListener {
//            val action = OnboardingFragmentDirections.actionOnboardingFragmentToHomeFragment()
//            it.findNavController().navigate(action)
//        }
    }

}
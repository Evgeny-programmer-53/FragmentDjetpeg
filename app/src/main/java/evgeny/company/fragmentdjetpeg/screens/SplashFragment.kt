package evgeny.company.fragmentdjetpeg.screens

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import evgeny.company.fragmentdjetpeg.R

class SplashFragment : Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.openLoginButton).setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }

    }
}



package com.example.myspot

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.contact_fragment.view.*

class ContactFragment : Fragment() {
    private val TAG = ContactFragment::class.java.simpleName

    private lateinit var contactViewModel: ContactViewModel
    private lateinit var viewModel: ContactViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactViewModel = ViewModelProvider(this).get(ContactViewModel::class.java)
        val root = inflater.inflate(R.layout.contact_fragment, container, false)
        root.doubts_link.setOnClickListener{
            Log.i(TAG, "Contacts")
            activity?.let { itl -> contactViewModel.doubtsRequest(itl) }

        }
        root.hiperlink_contact.movementMethod = LinkMovementMethod.getInstance()
        return root
    }
}
package com.iglesias.dummydictionary

import androidx.lifecycle.ViewModel
import com.iglesias.dummydictionary.model.Word
import com.iglesias.dummydictionary.repository.DictionaryRepository

class WordViewModel(private val repository: DictionaryRepository): ViewModel() {
    val words = repository.words

    fun addModify(word : Word){

        repository.addWord(word)
    }

}
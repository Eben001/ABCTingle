package com.ebenezer.gana.abctingle.utils

import android.content.Context
import android.media.AudioManager
import android.media.SoundPool
import com.ebenezer.gana.abctingle.R
import com.ebenezer.gana.abctingle.model.Alphabet

object AlphabetStore {

    private const val NR_OF_SIMULTANEOUS_SOUNDS = 7
    private const val LEFT_VOLUME = 1.0f
    private const val RIGHT_VOLUME = 1.0f
    private const val NO_LOOP = 0
    private const val PRIORITY = 0
    private const val NORMAL_PLAY_RATE = 1.0f


    private var mSoundPool: SoundPool? = null
    private var mCSoundId = 0
    private var mDSoundId = 0
    private var mESoundId = 0
    private var mFSoundId = 0
    private var mGSoundId = 0
    private var mASoundId = 0

    fun initializeSound(context: Context) {

        // Create a new SoundPool
        mSoundPool = SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0)


        // Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool!!.load(context, R.raw.note1_c, 1)
        mDSoundId = mSoundPool!!.load(context, R.raw.note2_d, 1)
        mESoundId = mSoundPool!!.load(context, R.raw.note3_e, 1)
        mFSoundId = mSoundPool!!.load(context, R.raw.note4_f, 1)
        mGSoundId = mSoundPool!!.load(context, R.raw.note5_g, 1)
        mASoundId = mSoundPool!!.load(context, R.raw.note6_a, 1)
    }

    fun playC() {
        mSoundPool?.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)

    }

    fun playD() {
        mSoundPool?.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)

    }

    fun playE() {
        mSoundPool?.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)

    }

    fun playF() {
        mSoundPool?.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)

    }

    fun playG() {
        mSoundPool?.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)

    }

    fun playA() {
        mSoundPool?.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)

    }

    private val alphabets = listOf(
        Alphabet(1, "A"),
        Alphabet(2, "B"),
        Alphabet(3, "C"),
        Alphabet(4, "D"),
        Alphabet(5, "E"),
        Alphabet(6, "F"),
        Alphabet(7, "G"),
        Alphabet(8, "H"),
        Alphabet(9, "I"),
        Alphabet(10, "J"),
        Alphabet(11, "K"),
        Alphabet(12, "L"),
        Alphabet(13, "M"),
        Alphabet(14, "N"),
        Alphabet(15, "O"),
        Alphabet(16, "P"),
        Alphabet(17, "Q"),
        Alphabet(18, "R"),
        Alphabet(19, "S"),
        Alphabet(20, "T"),
        Alphabet(21, "U"),
        Alphabet(22, "V"),
        Alphabet(23, "W"),
        Alphabet(24, "X"),
        Alphabet(25, "Y"),
        Alphabet(26, "Z")
    )

    fun getAllAlphabets() = alphabets

}
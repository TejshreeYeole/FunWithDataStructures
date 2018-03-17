package com.example.tejshreey.funwithdatastructures

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bubblesort.*


class BubbleSortSample : AppCompatActivity(){

    var inputList : ArrayList<Int> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bubblesort)

        btnAddMore.setOnClickListener({
            //adding all items to list
            var inputVal : Int =edtNumber.text.toString().toInt()
            inputList.add(inputVal)
            edtNumber.setText("")
        })

        var temp : Int

        btnDone.setOnClickListener({
            //run sort algo here
            for(i in 0 until inputList.size-1){
                for(j in 0 until inputList.size -2){
                    if(inputList[j] > inputList[j+1]){
                        temp=inputList[j]
                        inputList[j]=inputList[j+1]
                        inputList[j+1]=temp
                    }
                }
            }

            var output =""
            for(i in 0 until inputList.size){
                output += inputList[i]

                if(i!=inputList.size-1){
                    output+=","
                }
            }
            tvSortedList.text = output
        })
    }

}
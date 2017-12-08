package com.jy.soptwork4_basic

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
//xml을 적었던 변수를 연결할 변수를 만들고,

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_first_btn.setOnClickListener(this) //xml에서 지정한 버튼아이디 하나로 버튼 찾아오는거
        main_second_btn.setOnClickListener(this)
        main_third_btn.setOnClickListener(this)

        main_fourth_btn.setOnClickListener(this)
        main_fifth_btn.setOnClickListener(this)

        main_tag_btn.setOnClickListener(this)
        main_to_main2_btn.setOnClickListener(this)



        if(savedInstanceState==null){
            val bundle = Bundle()
            bundle.putString("title", main_first_btn!!.text.toString()) // 프래그먼트에서 타입 찾을때 필요한 키값, 버튼 text 가져옴
            AddFragment(FirstFragment(), bundle, "first") //가장 처음 프래그먼트를 붙임
            //그전 프래그먼트 지우고 다음 프래그먼트 붙임
        }
    }

    //이상해씨 바뀌는 부분까지가 액티비티, 감싸는 큰 부분이 메인임
    override fun onClick(v: View?) {
        when (v) {
            main_first_btn -> {
                /*  val bundle = Bundle()
                  bundle.putString("title", main_first_btn!!.text.toString())
                  AddFragment(FirstFragment(), bundle, "first",
                          supportFragmentManager.findFragmentById(R.id.main_container)) //해당 프레임이 갖고 있는 지우는 과정이 필요->manager 가 해줌
  */
                val bundle = Bundle()
                bundle.putString("title", main_first_btn!!.text.toString())
                replaceFragment(FirstFragment(), bundle, "first")

            }

            main_second_btn -> {
                /* val bundle = Bundle()
                 bundle.putString("title", main_second_btn!!.text.toString())
                 AddFragment(SecondFragment(), bundle, "second",
                         supportFragmentManager.findFragmentById(R.id.main_container)) //해당 프레임이 갖고 있는 지우는 과정이 필요->manager 가 해줌
                 */
                val bundle = Bundle()
                bundle.putString("title", main_second_btn!!.text.toString())
                replaceFragment(SecondFragment(), bundle, "second")


            }

            main_third_btn -> {
                /* val bundle = Bundle()
                 bundle.putString("title", main_third_btn!!.text.toString())
                 AddFragment(ThirdFragment(), bundle, "third",
                         supportFragmentManager.findFragmentById(R.id.main_container)) //해당 프레임이 갖고 있는 지우는 과정이 필요->manager 가 해줌
 */
                val bundle = Bundle()
                bundle.putString("title", main_third_btn!!.text.toString())
                replaceFragment(ThirdFragment(), bundle, "third")
            }

            main_fourth_btn ->{

                val bundle = Bundle()
                bundle.putString("title", main_fourth_btn!!.text.toString())
                replaceFragment(FourthFragment(), bundle, "fourth")

            }

            main_fifth_btn ->{

                val bundle = Bundle()
                bundle.putString("title", main_fifth_btn!!.text.toString())
                replaceFragment(FifthFragment(), bundle, "fifth")

            }

            main_tag_btn ->{
                TagFragment(main_tag.text.toString())
            }

            main_to_main2_btn ->{
                startActivity(Intent(this, Main2Activity::class.java))
            }
        }
    }


    fun AddFragment(fragment : Fragment, bundle: Bundle, tag: String, fragment2: Fragment) {

        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        fragment.arguments = bundle

        transaction.remove(fragment2)
        transaction.add(R.id.main_container, fragment, tag)
        transaction.commit()
        //fragmentManager 변수 선언, fragmentManager 가 전반적인 관리 해줌
        //이전 프래그먼트 지우고, 새 프래그먼트
    }

    fun AddFragment(fragment : Fragment, bundle: Bundle, tag: String) {

        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        fragment.arguments = bundle
        transaction.add(R.id.main_container, fragment, tag)
        transaction.commit()
        //붙이기만 할 프래그먼트
    }

    fun TagFragment(tag : String){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        val fragment = supportFragmentManager.findFragmentByTag(tag)
        //tag 없는 경우
        if (fragment!=null){
            transaction.replace(R.id.main_container, fragment)
            transaction.commit()
        }
    }

    fun replaceFragment(fragment : Fragment, bundle: Bundle, tag: String) {

        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        fragment.arguments = bundle
        transaction.replace(R.id.main_container, fragment, tag)
        transaction.addToBackStack(null) //이전에 띄웠던 프래그먼트 스택에 저장
        transaction.commit()

    }

}

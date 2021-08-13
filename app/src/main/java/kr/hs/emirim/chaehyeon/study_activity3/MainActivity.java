package kr.hs.emirim.chaehyeon.study_activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    //리스트 뷰에 표현될 배열
    String[] arr = {"java", "android", "spring", "jsp","database"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listView); //activity_main.xml에서 아이디를 가져와야 사용 가능

        //선택 위젯들은 Adapter클래스를 통해 내용을 지정
        //1.context: 화면 제어권자
        //2.layout: 리스트뷰 항목 하나의 디자인
        //3.참조파일: 리스틉에서 보여줄 스트링 배열
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_checked, arr);
        //생성된 어댑터를 listView에 세팅
        list.setAdapter(adapter);

    }//onCreate()
}
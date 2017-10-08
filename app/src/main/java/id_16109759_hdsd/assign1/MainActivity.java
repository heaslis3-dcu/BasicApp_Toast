package id_16109759_hdsd.assign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //Imported Log util,
import android.view.View;
import android.widget.Toast;

/*
 * ShowToast Method obtained from page 4 of the course assignment 1 notes SDA:
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Personalised log message for the onCreate() Method.
        Log.d("assign_1", "onCreate() method has been executed!");
    }
    //this code was copied from page 4 of the assignment instructions.
    public void showToast(View view) {

        /* Using CharSequence as a 'String' is a sequence of char characters,
        *  Relabelled ....(R.string.mess_1) from assignment instructions
        *  as the id used in the strings.xml file uses mess_toast,
        */
        CharSequence text = getResources().getString(R.string.mess_toast);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();

        //Personalised log message for the showToast Method.
        Log.d("assign_1", "showToast() method has been executed!");
    }

//    public void onDestroy() {
//
//        super.onDestroy();
//        Log.d("assign_1", "onDestroy() method has been executed, program shutting down!");
//    }
}

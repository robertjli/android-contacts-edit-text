package net.robertli.android.contactsedittext.demo;

import net.robertli.android.contactsedittext.ContactsEditText;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class DemoActivity extends Activity {

    ContactsEditText editText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editText = (ContactsEditText) findViewById(android.R.id.input);
        editText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                    long id) {
                ContactsEditText.Contact contact =
                        (ContactsEditText.Contact) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You clicked " + contact.displayName,
                        Toast.LENGTH_SHORT).show();
                editText.setText("");
            }
        });
    }

}

/*
* Copyright (C) 2012 Robert Li
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

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

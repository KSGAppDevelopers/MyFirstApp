package com.example.myfirstapp;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Element;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
 
public class FullscreenActivity extends Activity implements View.OnClickListener {
 
	Button button;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
	}
 
	public void button1Click() {
		startActivity(new Intent("com.example.myfirstapp.ParseXMLDemo"));
	}
		public void onClick(View v) {
			  switch (v.getId())
			  {
			  case R.id.button1:
			  button1Click();
			  break;
			  }
		
		
		
		//button = (Button) findViewById(R.id.button2);			//button2 
 		button.setOnClickListener(new OnClickListener() {
 			@Override
			public void onClick(View v) {
 			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/woche.html"));
			    startActivity(browserIntent);
 			}
 		});
 		button = (Button) findViewById(R.id.button3);			//button3 
 		button.setOnClickListener(new OnClickListener() {
 			@Override
			public void onClick(View v) {
 			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/imageslider-m.html"));
			    startActivity(browserIntent);
 			}
 		
 		});
 		button = (Button) findViewById(R.id.button4);			//button4 
 		button.setOnClickListener(new OnClickListener() {
 			@Override
			public void onClick(View v) {
 			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/we.html"));
			    startActivity(browserIntent);
 			}
 		
 		});
	
	}


	// TODO Auto-generated method stub
		
	}/*
	static final String URL = "http://api.androidhive.info/pizza/?format=xml";
    // XML node keys
    static final String KEY_ITEM = "item"; // parent node
    static final String KEY_ID = "id";
    static final String KEY_NAME = "name";
    static final String KEY_DESC = "description";
 
    super.onCreate(savedInstanceState);
   

    ArrayList<HashMap<String, String>> menuItems = new ArrayList<HashMap<String, String>>();

    XMLParser parser = new XMLParser();
    String xml = parser.getXmlFromUrl(URL); // getting XML
    Document doc = parser.getDomElement(xml); // getting DOM element

    NodeList nl = doc.getElementsByTagName(KEY_ITEM);
    // looping through all item nodes <item>
    for (int i = 0; i < nl.getLength(); i++) {
        // creating new HashMap
        HashMap<String, String> map = new HashMap<String, String>();
        Element e = (Element) nl.item(i);
        // adding each child node to HashMap key => value
        map.put(KEY_ID, parser.getValue(e, KEY_ID));
        map.put(KEY_NAME, parser.getValue(e, KEY_NAME));
        map.put(KEY_DESC, parser.getValue(e, KEY_DESC));

        // adding HashList to ArrayList
        menuItems.add(map);
    }

    // Adding menuItems to ListView
    ListAdapter adapter = new SimpleAdapter(this, menuItems,
            R.layout.list_item,
            new String[] { KEY_NAME, KEY_DESC}, new int[] {
                    R.id.name, R.id.desciption});

    setListAdapter(adapter);

    // selecting single ListView item
    ListView lv = getListView();
            // listening to single listitem click
    lv.setOnItemClickListener= new OnItemClickListener() {

        public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            // getting values from selected ListItem
            String name = ((TextView) view.findViewById(R.id.name)).getText().toString();
            String cost = ((TextView) view.findViewById(R.id.cost)).getText().toString();
            String description = ((TextView) view.findViewById(R.id.desciption)).getText().toString();
             
            // Starting new intent
            Intent in = new Intent(getApplicationContext(), SingleMenuItemActivity.class);
            in.putExtra(KEY_NAME, name);
            in.putExtra(KEY_COST, cost);
            in.putExtra(KEY_DESC, description);
            startActivity(in);

        }
    });
}

*/
/**
 * 
 */
package universsky.diddler;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author �����¹⽣
 * 2014��1��21��  ����5:34:27
 */
public class ItemActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item);
		TextView itemTextView = (TextView) findViewById(R.id.itemView1);
		
		//Retrieves a map of extended data from the intent.
		Bundle bundle = getIntent().getExtras();
		
		//Returns the value associated with the given key,
		//or null if no mapping of the desired type exists for the given key 
		//or a null value is explicitly associated with the key
		CharSequence item = bundle.getCharSequence("item");//��������
		//Open Declaration void android.widget.TextView.setText(CharSequence text)
		itemTextView.setText(item);
		//itemTextView.append(item);
	}

}

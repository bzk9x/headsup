package BRZ.HeadsUp;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import de.hdodenhof.circleimageview.*;
import eightbitlab.com.blurview.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class Home2Activity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear35;
	private LinearLayout linear57;
	private LinearLayout linear49;
	private LinearLayout linear43;
	private CircleImageView circleimageview1;
	private TextView textview1B;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview4B;
	private TextView textview5B;
	private TextView textview6R;
	private TextView textview7B;
	private LinearLayout linear14;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private ImageView imageview1;
	private TextView textview9B;
	private TextView textview8R;
	private TextView textview10B;
	private TextView textview11R;
	private TextView textview13BR;
	private TextView textview14R;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private ImageView imageview3;
	private TextView textview21B;
	private TextView textview22R;
	private TextView textview23B;
	private TextView textview24R;
	private TextView textview25BR;
	private TextView textview26R;
	private TextView textview27B;
	private LinearLayout linear36;
	private TextView textview28R;
	private ImageView imageview7;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private ImageView imageview6;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private TextView textview38B;
	private TextView textview39R;
	private TextView textview40B;
	private TextView textview41R;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private ImageView imageview5;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private TextView textview34B;
	private TextView textview35R;
	private TextView textview36BR;
	private TextView textview37R;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear17;
	private LinearLayout linear16;
	private ImageView imageview4;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private TextView textview30B;
	private TextView textview31B;
	private TextView textview32BR;
	private TextView textview33R;
	private LinearLayout linear67;
	private LinearLayout linear66;
	private LinearLayout linear65;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home2);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear35 = findViewById(R.id.linear35);
		linear57 = findViewById(R.id.linear57);
		linear49 = findViewById(R.id.linear49);
		linear43 = findViewById(R.id.linear43);
		circleimageview1 = findViewById(R.id.circleimageview1);
		textview1B = findViewById(R.id.textview1B);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		textview4B = findViewById(R.id.textview4B);
		textview5B = findViewById(R.id.textview5B);
		textview6R = findViewById(R.id.textview6R);
		textview7B = findViewById(R.id.textview7B);
		linear14 = findViewById(R.id.linear14);
		linear13 = findViewById(R.id.linear13);
		linear15 = findViewById(R.id.linear15);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		linear22 = findViewById(R.id.linear22);
		imageview1 = findViewById(R.id.imageview1);
		textview9B = findViewById(R.id.textview9B);
		textview8R = findViewById(R.id.textview8R);
		textview10B = findViewById(R.id.textview10B);
		textview11R = findViewById(R.id.textview11R);
		textview13BR = findViewById(R.id.textview13BR);
		textview14R = findViewById(R.id.textview14R);
		linear29 = findViewById(R.id.linear29);
		linear30 = findViewById(R.id.linear30);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		linear34 = findViewById(R.id.linear34);
		imageview3 = findViewById(R.id.imageview3);
		textview21B = findViewById(R.id.textview21B);
		textview22R = findViewById(R.id.textview22R);
		textview23B = findViewById(R.id.textview23B);
		textview24R = findViewById(R.id.textview24R);
		textview25BR = findViewById(R.id.textview25BR);
		textview26R = findViewById(R.id.textview26R);
		textview27B = findViewById(R.id.textview27B);
		linear36 = findViewById(R.id.linear36);
		textview28R = findViewById(R.id.textview28R);
		imageview7 = findViewById(R.id.imageview7);
		linear58 = findViewById(R.id.linear58);
		linear59 = findViewById(R.id.linear59);
		linear60 = findViewById(R.id.linear60);
		linear61 = findViewById(R.id.linear61);
		linear62 = findViewById(R.id.linear62);
		imageview6 = findViewById(R.id.imageview6);
		linear63 = findViewById(R.id.linear63);
		linear64 = findViewById(R.id.linear64);
		textview38B = findViewById(R.id.textview38B);
		textview39R = findViewById(R.id.textview39R);
		textview40B = findViewById(R.id.textview40B);
		textview41R = findViewById(R.id.textview41R);
		linear50 = findViewById(R.id.linear50);
		linear51 = findViewById(R.id.linear51);
		linear52 = findViewById(R.id.linear52);
		linear53 = findViewById(R.id.linear53);
		linear54 = findViewById(R.id.linear54);
		imageview5 = findViewById(R.id.imageview5);
		linear55 = findViewById(R.id.linear55);
		linear56 = findViewById(R.id.linear56);
		textview34B = findViewById(R.id.textview34B);
		textview35R = findViewById(R.id.textview35R);
		textview36BR = findViewById(R.id.textview36BR);
		textview37R = findViewById(R.id.textview37R);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear17 = findViewById(R.id.linear17);
		linear16 = findViewById(R.id.linear16);
		imageview4 = findViewById(R.id.imageview4);
		linear47 = findViewById(R.id.linear47);
		linear48 = findViewById(R.id.linear48);
		textview30B = findViewById(R.id.textview30B);
		textview31B = findViewById(R.id.textview31B);
		textview32BR = findViewById(R.id.textview32BR);
		textview33R = findViewById(R.id.textview33R);
		linear67 = findViewById(R.id.linear67);
		linear66 = findViewById(R.id.linear66);
		linear65 = findViewById(R.id.linear65);
	}
	
	private void initializeLogic() {
		imageview7.setColorFilter(0xFF4649E6, PorterDuff.Mode.MULTIPLY);
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)92, 0xFF101018));
		linear29.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)92, 0xFF101018));
		linear15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)92, 0xFF101018));
		textview1B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview4B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview5B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview6R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview7B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview9B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview8R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview10B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview11R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview13BR.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview14R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview21B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview22R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview23B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview24R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview25BR.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview26R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview27B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview28R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview30B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview31B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview32BR.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview33R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview33R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview34B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview35R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview36BR.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview37R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview38B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview39R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview40B.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview41R.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		linear59.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
		linear51.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
		linear45.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
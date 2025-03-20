package BRZ.HeadsUp;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
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
import eightbitlab.com.blurview.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private BlurView linear10;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear12;
	private LinearLayout linear44;
	private LinearLayout linear20;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear15;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear17;
	private ImageView imageview1;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private ImageView imageview2;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private TextView textview12;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private ImageView imageview5;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private TextView textview24;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private LinearLayout linear52;
	private LinearLayout linear11;
	private TextView textview7;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear10 = findViewById(R.id.linear10);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear12 = findViewById(R.id.linear12);
		linear44 = findViewById(R.id.linear44);
		linear20 = findViewById(R.id.linear20);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		linear15 = findViewById(R.id.linear15);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear17 = findViewById(R.id.linear17);
		imageview1 = findViewById(R.id.imageview1);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		linear48 = findViewById(R.id.linear48);
		imageview2 = findViewById(R.id.imageview2);
		linear50 = findViewById(R.id.linear50);
		linear51 = findViewById(R.id.linear51);
		textview12 = findViewById(R.id.textview12);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview27 = findViewById(R.id.textview27);
		linear21 = findViewById(R.id.linear21);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		imageview5 = findViewById(R.id.imageview5);
		linear26 = findViewById(R.id.linear26);
		linear27 = findViewById(R.id.linear27);
		textview24 = findViewById(R.id.textview24);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		linear52 = findViewById(R.id.linear52);
		linear11 = findViewById(R.id.linear11);
		textview7 = findViewById(R.id.textview7);
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				int notifyId = 001;
				        androidx.core.app.NotificationCompat.Builder mBuilder = new androidx.core.app.NotificationCompat.Builder(HomeActivity.this,"id 2") 
				                .setSmallIcon(R.drawable.img) 
				                .setContentTitle("Imcoming Transfer Successful")        
				           .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.netflix))
				                 .setContentText("Adenuga Abolaji Sunday has sent you ₦120,000.00. Get up to 6% bonus on Opay Airtime"); 
				 
				        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE); 
				
				        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { 
					            String channelId2 = "2"; 
					            String channelName2 = "channel2"; 
					 
					            NotificationChannel channel = new NotificationChannel(channelId2, channelName2, NotificationManager.IMPORTANCE_HIGH); 
					 
					            channel.enableLights(true); 
					            channel.setLightColor(Color.RED); 
					            channel.setShowBadge(true); 
					            channel.enableVibration(true); 
					 
					            mBuilder.setChannelId(channelId2); 
					 
					            if (notificationManager != null) { 
						                notificationManager.createNotificationChannel(channel); 
						            } 
					        } else { 
					            mBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE); 
					        } 
				 
				        if (notificationManager != null) { 
					            notificationManager.notify(notifyId, mBuilder.build()); 
					        } 
				 
			}
		});
		
		linear46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				int notifyId = 002;
				        androidx.core.app.NotificationCompat.Builder mBuilder = new androidx.core.app.NotificationCompat.Builder(HomeActivity.this,"id 2") 
				                .setSmallIcon(R.drawable.img) 
				                .setContentTitle("Reminder")        
				           .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.spotify))
				                 .setContentText("Your Spotify subscription is due in 23 days"); 
				 
				        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE); 
				
				        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { 
					            String channelId2 = "2"; 
					            String channelName2 = "channel2"; 
					 
					            NotificationChannel channel = new NotificationChannel(channelId2, channelName2, NotificationManager.IMPORTANCE_HIGH); 
					 
					            channel.enableLights(true); 
					            channel.setLightColor(Color.RED); 
					            channel.setShowBadge(true); 
					            channel.enableVibration(true); 
					 
					            mBuilder.setChannelId(channelId2); 
					 
					            if (notificationManager != null) { 
						                notificationManager.createNotificationChannel(channel); 
						            } 
					        } else { 
					            mBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE); 
					        } 
				 
				        if (notificationManager != null) { 
					            notificationManager.notify(notifyId, mBuilder.build()); 
					        } 
				 
			}
		});
		
		linear22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				int notifyId = 003;
				        androidx.core.app.NotificationCompat.Builder mBuilder = new androidx.core.app.NotificationCompat.Builder(HomeActivity.this,"id 2") 
				                .setSmallIcon(R.drawable.img) 
				                .setContentTitle("Reminder")        
				           .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.youtube))
				                 .setContentText("Your YouTube premium subscription is due in 23 days"); 
				 
				        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE); 
				
				        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { 
					            String channelId2 = "2"; 
					            String channelName2 = "channel2"; 
					 
					            NotificationChannel channel = new NotificationChannel(channelId2, channelName2, NotificationManager.IMPORTANCE_HIGH); 
					 
					            channel.enableLights(true); 
					            channel.setLightColor(Color.RED); 
					            channel.setShowBadge(true); 
					            channel.enableVibration(true); 
					 
					            mBuilder.setChannelId(channelId2); 
					 
					            if (notificationManager != null) { 
						                notificationManager.createNotificationChannel(channel); 
						            } 
					        } else { 
					            mBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE); 
					        } 
				 
				        if (notificationManager != null) { 
					            notificationManager.notify(notifyId, mBuilder.build()); 
					        } 
				 
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Home2Activity.class);
				startActivity(intent);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)2000, (int)3, 0xFF292B44, Color.TRANSPARENT));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
		linear13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
		linear46.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
		linear22.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)92, (int)3, 0xFF292B44, Color.TRANSPARENT));
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview24.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_bold.ttf"), 1);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview25.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		textview26.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 1);
		textview27.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sf_regular.ttf"), 0);
		_RippleEffect(linear11, 92, 2, "#4649E6", true);
	}
	
	public void _RippleEffect(final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#212121")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
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
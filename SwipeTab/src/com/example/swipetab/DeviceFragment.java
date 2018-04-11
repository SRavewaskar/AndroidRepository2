package com.example.swipetab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DeviceFragment extends Fragment {
	
	public static final String ImageIDKey = "imagekey";
	public static final String DescriptionKey = "descriptionkey";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.fragment_device,container,false);
		
		Bundle bundle = getArguments();
		
		if(bundle != null){
			
			int imageId = bundle.getInt(ImageIDKey);
			String description = bundle.getString(DescriptionKey);
			
			dispalyValues(view, imageId, description);
		}
		
		return view;
}

	private void dispalyValues(View view, int imageId, String description) {
		// TODO Auto-generated method stub
		
		ImageView imageView = (ImageView) view.findViewById(R.id.imageViewDevice);
		imageView.setImageResource(imageId);
		
		TextView textView = (TextView) view.findViewById(R.id.tvDeviceDescription);
		textView.setText(description);
	}
}
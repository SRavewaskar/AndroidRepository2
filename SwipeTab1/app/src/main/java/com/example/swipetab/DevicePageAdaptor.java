package com.example.swipetab;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DevicePageAdaptor extends FragmentPagerAdapter {
	
	String[] devices;
	String[] deviceDescription;


	public DevicePageAdaptor(FragmentManager fm, Context context) {
		super(fm);
		// TODO Auto-generated constructor stub
		
		Resources resources = context.getResources();
		
		devices = resources.getStringArray(R.array.devices);
		deviceDescription = resources.getStringArray(R.array.device_description); 
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		
		Bundle bundle = new Bundle();
		bundle.putString(DeviceFragment.DescriptionKey,deviceDescription[position]);
		bundle.putInt(DeviceFragment.ImageIDKey,getDeviceIamgeID(position));
		
		DeviceFragment deviceFragment = new DeviceFragment();
		deviceFragment.setArguments(bundle);
		
		
		
		return deviceFragment;
	}

	private int getDeviceIamgeID(int position){
		
		int id=0;
		switch (position)
		{
		
		case 0:
			id = R.drawable.windows;
			break;
			
		case 1:
			id = R.drawable.android;
			break;
			
		case 2:
			id = R.drawable.ios;
			break;
		}
		
		return id;
	}
	
	
	
	
	
	
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return devices[position];
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return devices.length;
	}

}

package com.soundcloud.android.crop;

import java.io.Serializable;

public class CropInformation implements Serializable {


	protected boolean hasCrop = false;

	/**
	 * denotes the left crop coordinate as a float between 0.0 and 1.0 of the image width
	 */
	protected float x;

	/**
	 * denotes the top crop coordinate as a float between 0.0 and 1.0 of the image height
	 */
	protected float y;

	/**
	 * denotes the width of the thumbnail as a float between 0.0 and 1.0 of the image width
	 */
	protected float w;

	/**
	 * denotes the height of the thumbnail as a float between 0.0 and 1.0 of the image height
	 */
	protected float h;


	public void set(float x, float y, float w, float h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.hasCrop = true;
	}


	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getW() {
		return w;
	}

	public float getH() {
		return h;
	}

	public boolean isHasCrop() {
		return hasCrop;
	}

	@Override
	public String toString() {
		if (hasCrop) {
			return "CropInformation x=" + Float.toString(x) + " y=" + Float.toString(y) + " w=" + Float.toString(w) + " h=" + Float.toString(h);
		} else {
			return "CropInformaton no crop set";
		}
	}
}

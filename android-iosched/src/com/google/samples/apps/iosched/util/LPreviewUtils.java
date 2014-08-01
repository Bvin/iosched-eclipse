package com.google.samples.apps.iosched.util;

import android.app.Activity;

public class LPreviewUtils {

  private LPreviewUtils() {
  }

  public static LPreviewUtilsBase getInstance(Activity activity) {
      return new LPreviewUtilsBase(activity);
  }
}

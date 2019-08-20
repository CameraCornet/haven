package org.havenapp.main;

import android.graphics.Bitmap;

public class DataSpotA {
    public static int detectCalledCount = 0;
    public static int incomingFrameCount = 0;
    public static int incomingSkipCount = 0;
    public static int processFrameTimeSkipCount = 0;
    public static int processFrameDataNullCount = 0;
    public static int processFrameSizeNullCount = 0;

    public static int motionDetectOldIsNullCount = 0;
    public static int motionDetectChangedPixelsNullCount = 0;

    public static int motionDetectorChangedPixelsCount = 0;
    public static int motionDetectorChangedPixelsBasis = 0;
    public static int motionDetectorChangedPixelsFrame = 0;
    public static Bitmap motionDetectorHighlightImage = null;
}

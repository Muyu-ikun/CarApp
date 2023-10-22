package com.example.carapp;

import android.util.Size;
import java.util.Comparator;

public class CompareSizesByArea implements Comparator<Size> {

    @Override
    public int compare(Size lhs, Size rhs) {
        // 根据面积比较两个尺寸
        return Long.signum((long) lhs.getWidth() * lhs.getHeight() - (long) rhs.getWidth() * rhs.getHeight());
    }
}


//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video.objdetect;

import org.opencv.core.Algorithm;

// C++: class BaseCascadeClassifier
//javadoc: BaseCascadeClassifier
public class BaseCascadeClassifier extends Algorithm {

    protected BaseCascadeClassifier(long addr) { super(addr); }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}

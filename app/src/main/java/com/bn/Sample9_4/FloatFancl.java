package com.bn.Sample9_4;

import java.io.Serializable;

/**
 * Created by limingtian on 16/7/7.
 */
public class FloatFancl implements Serializable {

    float[] vXYZ,nXYZ,tST;

    public FloatFancl(float[] vXYZ, float[] nXYZ, float[] tST) {
        this.vXYZ = vXYZ;
        this.nXYZ = nXYZ;
        this.tST = tST;
    }
}

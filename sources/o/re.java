package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class re implements SensorEventListener {
    public pk0 a;
    public Handler b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Handler handler = this.b;
        float f = sensorEvent.values[0];
        if (f <= 45.0f) {
            handler.post(new qe((byte) 0, this, true));
        } else if (f >= 450.0f) {
            handler.post(new qe((byte) 0, this, false));
        }
    }
}

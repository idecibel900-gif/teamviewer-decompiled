package o;

import com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.ISelectedMarkerDataUpdateSignalCallback;
import com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.MarkerData;
import com.teamviewer.remotecontrolviewlib.fragment.session.ExpandableTopTextBox;

/* JADX INFO: loaded from: classes.dex */
public final class xf8 extends ISelectedMarkerDataUpdateSignalCallback {
    public final /* synthetic */ zf8 a;

    public xf8(zf8 zf8Var) {
        this.a = zf8Var;
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.ISelectedMarkerDataUpdateSignalCallback
    public final void OnCallback(MarkerData markerData) {
        Integer numValueOf;
        markerData.getClass();
        boolean markerAlive = markerData.getMarkerAlive();
        zf8 zf8Var = this.a;
        zf8Var.D0 = markerAlive;
        boolean markerAlive2 = markerData.getMarkerAlive();
        d11 d11Var = zf8Var.y0;
        Long lValueOf = null;
        if (!markerAlive2) {
            if (d11Var != null) {
                ((ExpandableTopTextBox) d11Var.p).setInfoText(new kf2(null, null, null));
            }
            zf8Var.D0(vf8.n);
        } else if (d11Var != null) {
            ExpandableTopTextBox expandableTopTextBox = (ExpandableTopTextBox) d11Var.p;
            if (markerData.getHasNumber()) {
                lValueOf = Long.valueOf(markerData.getDigit());
                numValueOf = Integer.valueOf((int) markerData.getColorARGB());
            } else {
                numValueOf = null;
            }
            expandableTopTextBox.setInfoText(new kf2(markerData.getText(), lValueOf, numValueOf));
        }
    }
}

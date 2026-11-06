package o;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public final class s73 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !im3.n(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new gp(xMLReader.getContentHandler(), editable));
    }
}

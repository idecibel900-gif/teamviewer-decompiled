package o;

import android.view.View;
import android.widget.TextView;
import com.teamviewer.chatviewmodel.swig.IEventMessageUIModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class to0 extends b0 {
    public static final /* synthetic */ int J = 0;
    public final TextView I;

    public to0(View view) {
        super(view, 0);
        View viewFindViewById = view.findViewById(R.id.chat_conversation_event_textview);
        viewFindViewById.getClass();
        this.I = (TextView) viewFindViewById;
    }

    @Override // o.b0
    public final void s(Object obj, boolean z) {
        IEventMessageUIModel iEventMessageUIModel = (IEventMessageUIModel) obj;
        if (iEventMessageUIModel != null) {
            this.I.setText(iEventMessageUIModel.GetMessageContent());
        }
    }
}

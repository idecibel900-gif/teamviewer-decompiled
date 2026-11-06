package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.chatviewlib.view.AccountPictureView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class np0 extends c76 {
    public static final /* synthetic */ int K = 0;
    public final lp0 G;
    public final TextView H;
    public final AccountPictureView I;
    public final ImageView J;

    public np0(View view, lp0 lp0Var) {
        super(view);
        this.G = lp0Var;
        View viewFindViewById = view.findViewById(R.id.chat_conversation_chatendpoint_name);
        viewFindViewById.getClass();
        this.H = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chat_conversation_chatendpoint_account_picture_view);
        viewFindViewById2.getClass();
        this.I = (AccountPictureView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chat_conversation_chatendpoint_icon_view);
        viewFindViewById3.getClass();
        this.J = (ImageView) viewFindViewById3;
    }
}

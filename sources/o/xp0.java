package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IOwnFileMessageUIModel;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.math.BigInteger;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends b0 {
    public static final /* synthetic */ int M = 0;
    public final View I;
    public final TextView J;
    public final ImageView K;
    public final TextView L;

    public xp0(View view) {
        super(view, 2);
        View viewFindViewById = view.findViewById(R.id.chat_outgoing_error_indicator);
        viewFindViewById.getClass();
        this.I = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chat_message_outgoing);
        viewFindViewById2.getClass();
        this.J = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chat_message_thumbnail);
        viewFindViewById3.getClass();
        this.K = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.chat_outgoing_timestamp);
        viewFindViewById4.getClass();
        this.L = (TextView) viewFindViewById4;
    }

    @Override // o.b0
    public final Object r(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        return ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetOwnFileMessageById(chatConversationID, chatMessageID);
    }

    @Override // o.b0
    public final void s(Object obj, boolean z) {
        BigInteger bigIntegerGetFileSize;
        IOwnFileMessageUIModel iOwnFileMessageUIModel = (IOwnFileMessageUIModel) obj;
        TextView textView = this.L;
        View view = this.I;
        if (iOwnFileMessageUIModel != null && iOwnFileMessageUIModel.DeliveryFailed()) {
            textView.setVisibility(0);
            textView.setText(R.string.tv_chat_message_error_indicator);
            view.setVisibility(0);
            view.setOnClickListener(new io.sentry.android.core.p2(this, iOwnFileMessageUIModel, (byte) 9));
        } else if (iOwnFileMessageUIModel == null || !iOwnFileMessageUIModel.WasSent()) {
            textView.setVisibility(4);
            view.setVisibility(8);
            view.setOnClickListener(null);
        } else {
            textView.setVisibility(0);
            SimpleDateFormat simpleDateFormat = rp0.a;
            textView.setText(rp0.a(iOwnFileMessageUIModel.GetTimestamp()));
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
        this.J.setText(vb7.C("\n            " + (iOwnFileMessageUIModel != null ? iOwnFileMessageUIModel.GetFileName() : null) + "\n            " + ((iOwnFileMessageUIModel == null || (bigIntegerGetFileSize = iOwnFileMessageUIModel.GetFileSize()) == null) ? null : Formatter.formatShortFileSize(this.m.getContext(), bigIntegerGetFileSize.longValue())) + "\n            "));
        String strGetFileName = iOwnFileMessageUIModel != null ? iOwnFileMessageUIModel.GetFileName() : null;
        ImageView imageView = this.K;
        imageView.setContentDescription(strGetFileName);
        if (iOwnFileMessageUIModel == null || !iOwnFileMessageUIModel.HasThumbnail()) {
            return;
        }
        byte[] bArrGetThumbnailData = iOwnFileMessageUIModel.GetThumbnailData();
        bArrGetThumbnailData.getClass();
        if (bArrGetThumbnailData.length == 0) {
            iOwnFileMessageUIModel.DownloadThumbnail();
            return;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrGetThumbnailData, 0, bArrGetThumbnailData.length);
        if (bitmapDecodeByteArray != null) {
            imageView.setImageBitmap(bitmapDecodeByteArray);
        }
    }

    @Override // o.b0
    public final void t(Object obj, VoidSignalCallback[] voidSignalCallbackArr) {
        IOwnFileMessageUIModel iOwnFileMessageUIModel = (IOwnFileMessageUIModel) obj;
        ChatSignalsHelper.RegisterOwnFileMessageChangedSlot(iOwnFileMessageUIModel, voidSignalCallbackArr[0]);
        ChatSignalsHelper.RegisterOwnFileMessageChangedSlot2(iOwnFileMessageUIModel, voidSignalCallbackArr[1]);
    }
}

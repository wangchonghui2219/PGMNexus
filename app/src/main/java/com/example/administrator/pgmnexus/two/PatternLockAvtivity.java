package com.example.administrator.pgmnexus.two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.PatternLockViewListener;
import com.andrognito.patternlockview.utils.PatternLockUtils;
import com.andrognito.rxpatternlockview.RxPatternLockView;
import com.andrognito.rxpatternlockview.events.PatternLockCompoundEvent;
import com.example.administrator.pgmnexus.R;

import java.util.List;
import java.util.function.Consumer;

public class PatternLockAvtivity extends AppCompatActivity {

    private PatternLockView pattern_lock_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_lock_avtivity);
        initView();
    }

    private void initView() {
        pattern_lock_view = (PatternLockView) findViewById(R.id.pattern_lock_view);
        pattern_lock_view.addPatternLockListener(mPatternLockViewListener);
    }
    private PatternLockViewListener mPatternLockViewListener = new PatternLockViewListener() {
        @Override
        public void onStarted() {
            Log.d(getClass().getName(), "4");
        }

        @Override
        public void onProgress(List<PatternLockView.Dot> progressPattern) {
            Log.d(getClass().getName(), "3 " +
                    PatternLockUtils.patternToString(pattern_lock_view, progressPattern));
        }

        @Override
        public void onComplete(List<PatternLockView.Dot> pattern) {
            Log.d(getClass().getName(), "2 " +
                    PatternLockUtils.patternToString(pattern_lock_view, pattern));
        }

        @Override
        public void onCleared() {
            Log.d(getClass().getName(), "1");
        }
    };
   private void initData(){
//       RxPatternLockView.patternChanges(pattern_lock_view)
//               .subscribe(new Consumer<PatternLockCompoundEvent>() {
//                   @Override
//                   public void accept(PatternLockCompoundEvent event) throws Exception {
//                       if (event.getEventType() == PatternLockCompoundEvent.EventType.PATTERN_STARTED) {
//                           Log.d(getClass().getName(), "Pattern drawing started");
//                       } else if (event.getEventType() == PatternLockCompoundEvent.EventType.PATTERN_PROGRESS) {
//                           Log.d(getClass().getName(), "Pattern progress: " +
//                                   PatternLockUtils.patternToString(pattern_lock_view, event.getPattern()));
//                       } else if (event.getEventType() == PatternLockCompoundEvent.EventType.PATTERN_COMPLETE) {
//                           Log.d(getClass().getName(), "Pattern complete: " +
//                                   PatternLockUtils.patternToString(pattern_lock_view, event.getPattern()));
//                       } else if (event.getEventType() == PatternLockCompoundEvent.EventType.PATTERN_CLEARED) {
//                           Log.d(getClass().getName(), "Pattern has been cleared");
//                       }
//                   }
//               });
   }
}

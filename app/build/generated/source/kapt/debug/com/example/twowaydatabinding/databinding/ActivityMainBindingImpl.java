package com.example.twowaydatabinding.databinding;
import com.example.twowaydatabinding.R;
import com.example.twowaydatabinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_gender, 7);
        sViewsWithIds.put(R.id.rb_male, 8);
        sViewsWithIds.put(R.id.rb_female, 9);
        sViewsWithIds.put(R.id.layout_city, 10);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerRunCodeAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.user.email
            //         is viewModel.user.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmail);
            // localize variables for thread safety
            // viewModel.user.email
            java.lang.String viewModelUserEmail = null;
            // viewModel
            com.example.twowaydatabinding.viewmodel.MainViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.user
            com.example.twowaydatabinding.model.User viewModelUser = null;
            // viewModel.user != null
            boolean viewModelUserJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUser = viewModel.getUser();

                viewModelUserJavaLangObjectNull = (viewModelUser) != (null);
                if (viewModelUserJavaLangObjectNull) {




                    viewModelUser.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.user.username
            //         is viewModel.user.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // viewModel.user.username
            java.lang.String viewModelUserUsername = null;
            // viewModel
            com.example.twowaydatabinding.viewmodel.MainViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.user
            com.example.twowaydatabinding.model.User viewModelUser = null;
            // viewModel.user != null
            boolean viewModelUserJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUser = viewModel.getUser();

                viewModelUserJavaLangObjectNull = (viewModelUser) != (null);
                if (viewModelUserJavaLangObjectNull) {




                    viewModelUser.setUsername(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.RadioGroup) bindings[3]
            , (android.widget.Spinner) bindings[4]
            , (android.widget.TextView) bindings[6]
            );
        this.btnUpdate.setTag(null);
        this.container.setTag(null);
        this.etEmail.setTag(null);
        this.etUsername.setTag(null);
        this.rgGender.setTag(null);
        this.spinnerCity.setTag(null);
        this.tvOutput.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((com.example.twowaydatabinding.MainActivity) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.twowaydatabinding.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.example.twowaydatabinding.MainActivity Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.twowaydatabinding.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUser((com.example.twowaydatabinding.model.User) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUser(com.example.twowaydatabinding.model.User ViewModelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.username) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.gender) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.city) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelUserEmail = null;
        java.lang.String viewModelUserUsername = null;
        com.example.twowaydatabinding.model.User viewModelUser = null;
        int viewModelUserCityOrdinal = 0;
        com.example.twowaydatabinding.model.Cities viewModelUserCity = null;
        com.example.twowaydatabinding.MainActivity handler = mHandler;
        int viewModelUserGenderGenderMALEAndroidIdRbMaleAndroidIdRbFemale = 0;
        com.example.twowaydatabinding.model.Gender viewModelUserGender = null;
        boolean viewModelUserGenderGenderMALE = false;
        java.lang.String viewModelUserToString = null;
        android.view.View.OnClickListener handlerRunCodeAndroidViewViewOnClickListener = null;
        com.example.twowaydatabinding.viewmodel.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x82L) != 0) {



                if (handler != null) {
                    // read handler::runCode
                    handlerRunCodeAndroidViewViewOnClickListener = (((mHandlerRunCodeAndroidViewViewOnClickListener == null) ? (mHandlerRunCodeAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerRunCodeAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0xfdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.user
                    viewModelUser = viewModel.getUser();
                }
                updateRegistration(0, viewModelUser);

            if ((dirtyFlags & 0x8dL) != 0) {

                    if (viewModelUser != null) {
                        // read viewModel.user.email
                        viewModelUserEmail = viewModelUser.getEmail();
                    }
            }
            if ((dirtyFlags & 0x95L) != 0) {

                    if (viewModelUser != null) {
                        // read viewModel.user.username
                        viewModelUserUsername = viewModelUser.getUsername();
                    }
            }
            if ((dirtyFlags & 0xc5L) != 0) {

                    if (viewModelUser != null) {
                        // read viewModel.user.city
                        viewModelUserCity = viewModelUser.getCity();
                    }


                    if (viewModelUserCity != null) {
                        // read viewModel.user.city.ordinal()
                        viewModelUserCityOrdinal = viewModelUserCity.ordinal();
                    }
            }
            if ((dirtyFlags & 0xa5L) != 0) {

                    if (viewModelUser != null) {
                        // read viewModel.user.gender
                        viewModelUserGender = viewModelUser.getGender();
                    }


                    // read viewModel.user.gender == Gender.MALE
                    viewModelUserGenderGenderMALE = (viewModelUserGender) == (com.example.twowaydatabinding.model.Gender.MALE);
                if((dirtyFlags & 0xa5L) != 0) {
                    if(viewModelUserGenderGenderMALE) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.user.gender == Gender.MALE ? @android:id/rb_male : @android:id/rb_female
                    viewModelUserGenderGenderMALEAndroidIdRbMaleAndroidIdRbFemale = ((viewModelUserGenderGenderMALE) ? (R.id.rb_male) : (R.id.rb_female));
            }
            if ((dirtyFlags & 0x85L) != 0) {

                    if (viewModelUser != null) {
                        // read viewModel.user.toString()
                        viewModelUserToString = viewModelUser.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            this.btnUpdate.setOnClickListener(handlerRunCodeAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x8dL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, viewModelUserEmail);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x95L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, viewModelUserUsername);
        }
        if ((dirtyFlags & 0xa5L) != 0) {
            // api target 1

            androidx.databinding.adapters.RadioGroupBindingAdapter.setCheckedButton(this.rgGender, viewModelUserGenderGenderMALEAndroidIdRbMaleAndroidIdRbFemale);
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.spinnerCity, viewModelUserCityOrdinal);
        }
        if ((dirtyFlags & 0x85L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOutput, viewModelUserToString);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.twowaydatabinding.MainActivity value;
        public OnClickListenerImpl setValue(com.example.twowaydatabinding.MainActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.runCode(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.user
        flag 1 (0x2L): handler
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): viewModel.user.email
        flag 4 (0x5L): viewModel.user.username
        flag 5 (0x6L): viewModel.user.gender
        flag 6 (0x7L): viewModel.user.city
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.user.gender == Gender.MALE ? @android:id/rb_male : @android:id/rb_female
        flag 9 (0xaL): viewModel.user.gender == Gender.MALE ? @android:id/rb_male : @android:id/rb_female
    flag mapping end*/
    //end
}
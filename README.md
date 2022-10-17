# animacja
    private void startRotate() {
        Animation out = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        out.setDuration(4000);
        out.setRepeatCount(3);
        out.setFillAfter(true);
        imageEagle.startAnimation(out);


    }

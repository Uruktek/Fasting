var Progressbar = require('progressbar.js');

var bar = new Progressbar.SemiCircle(container, {
    strokeWidth: 6,
    easing: 'easeInOut',
    duration: 1400,
    color: '#ffffffff',
    svgStyle: null
});

bar.animate(1.0);

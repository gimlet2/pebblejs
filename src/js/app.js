(function (_, Kotlin, $module$ui) {
  'use strict';
  var Card_init = $module$ui.Card;
  function main(args) {
    card('Title', 'Hello world!').show();
  }
  function card(title, body) {
    if (body === void 0)
      body = '';
    var c = new Card_init();
    c.title(title);
    c.body(body);
    return c;
  }
  var package$app = _.app || (_.app = {});
  package$app.main_kand9s$ = main;
  var package$pebble = _.pebble || (_.pebble = {});
  package$pebble.card_puj7f4$ = card;
  main([]);
  return _;
}(module.exports, require('kotlin'), require('ui')));

//# sourceMappingURL=app.js.map

// Compiled by ClojureScript 0.0-2755 {}
goog.provide('cljs.repl');
goog.require('cljs.core');
cljs.repl.print_doc = (function print_doc(m){
cljs.core.println.call(null,"-------------------------");

cljs.core.println.call(null,[cljs.core.str((function (){var temp__4126__auto__ = new cljs.core.Keyword(null,"ns","ns",441598760).cljs$core$IFn$_invoke$arity$1(m);
if(cljs.core.truth_(temp__4126__auto__)){
var ns = temp__4126__auto__;
return [cljs.core.str(ns),cljs.core.str("/")].join('');
} else {
return null;
}
})()),cljs.core.str(new cljs.core.Keyword(null,"name","name",1843675177).cljs$core$IFn$_invoke$arity$1(m))].join(''));

if(cljs.core.truth_(new cljs.core.Keyword(null,"forms","forms",2045992350).cljs$core$IFn$_invoke$arity$1(m))){
var seq__11634_11638 = cljs.core.seq.call(null,new cljs.core.Keyword(null,"forms","forms",2045992350).cljs$core$IFn$_invoke$arity$1(m));
var chunk__11635_11639 = null;
var count__11636_11640 = (0);
var i__11637_11641 = (0);
while(true){
if((i__11637_11641 < count__11636_11640)){
var f_11642 = cljs.core._nth.call(null,chunk__11635_11639,i__11637_11641);
cljs.core.print.call(null,"  ");

cljs.core.prn.call(null,f_11642);

var G__11643 = seq__11634_11638;
var G__11644 = chunk__11635_11639;
var G__11645 = count__11636_11640;
var G__11646 = (i__11637_11641 + (1));
seq__11634_11638 = G__11643;
chunk__11635_11639 = G__11644;
count__11636_11640 = G__11645;
i__11637_11641 = G__11646;
continue;
} else {
var temp__4126__auto___11647 = cljs.core.seq.call(null,seq__11634_11638);
if(temp__4126__auto___11647){
var seq__11634_11648__$1 = temp__4126__auto___11647;
if(cljs.core.chunked_seq_QMARK_.call(null,seq__11634_11648__$1)){
var c__4712__auto___11649 = cljs.core.chunk_first.call(null,seq__11634_11648__$1);
var G__11650 = cljs.core.chunk_rest.call(null,seq__11634_11648__$1);
var G__11651 = c__4712__auto___11649;
var G__11652 = cljs.core.count.call(null,c__4712__auto___11649);
var G__11653 = (0);
seq__11634_11638 = G__11650;
chunk__11635_11639 = G__11651;
count__11636_11640 = G__11652;
i__11637_11641 = G__11653;
continue;
} else {
var f_11654 = cljs.core.first.call(null,seq__11634_11648__$1);
cljs.core.print.call(null,"  ");

cljs.core.prn.call(null,f_11654);

var G__11655 = cljs.core.next.call(null,seq__11634_11648__$1);
var G__11656 = null;
var G__11657 = (0);
var G__11658 = (0);
seq__11634_11638 = G__11655;
chunk__11635_11639 = G__11656;
count__11636_11640 = G__11657;
i__11637_11641 = G__11658;
continue;
}
} else {
}
}
break;
}
} else {
if(cljs.core.truth_(new cljs.core.Keyword(null,"arglists","arglists",1661989754).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.prn.call(null,new cljs.core.Keyword(null,"arglists","arglists",1661989754).cljs$core$IFn$_invoke$arity$1(m));
} else {
}
}

if(cljs.core.truth_(new cljs.core.Keyword(null,"special-form","special-form",-1326536374).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.println.call(null,"Special Form");

cljs.core.println.call(null," ",new cljs.core.Keyword(null,"doc","doc",1913296891).cljs$core$IFn$_invoke$arity$1(m));

if(cljs.core.contains_QMARK_.call(null,m,new cljs.core.Keyword(null,"url","url",276297046))){
if(cljs.core.truth_(new cljs.core.Keyword(null,"url","url",276297046).cljs$core$IFn$_invoke$arity$1(m))){
return cljs.core.println.call(null,[cljs.core.str("\n  Please see http://clojure.org/"),cljs.core.str(new cljs.core.Keyword(null,"url","url",276297046).cljs$core$IFn$_invoke$arity$1(m))].join(''));
} else {
return null;
}
} else {
return cljs.core.println.call(null,[cljs.core.str("\n  Please see http://clojure.org/special_forms#"),cljs.core.str(new cljs.core.Keyword(null,"name","name",1843675177).cljs$core$IFn$_invoke$arity$1(m))].join(''));
}
} else {
if(cljs.core.truth_(new cljs.core.Keyword(null,"macro","macro",-867863404).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.println.call(null,"Macro");
} else {
}

return cljs.core.println.call(null," ",new cljs.core.Keyword(null,"doc","doc",1913296891).cljs$core$IFn$_invoke$arity$1(m));
}
});

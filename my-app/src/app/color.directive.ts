import {Directive, ElementRef, Input} from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  constructor(el: ElementRef) {

    el.nativeElement.style.backgroundColor = 'red';
  }
}

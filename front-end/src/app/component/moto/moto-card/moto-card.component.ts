import { Component, Input, OnInit } from '@angular/core';
import { Moto } from 'src/app/model/moto';

@Component({
  selector: 'app-moto-card',
  templateUrl: './moto-card.component.html',
  styleUrls: ['./moto-card.component.css']
})
export class MotoCardComponent implements OnInit {

  @Input() moto!: Moto;

  constructor() { }

  ngOnInit(): void {
  }

}

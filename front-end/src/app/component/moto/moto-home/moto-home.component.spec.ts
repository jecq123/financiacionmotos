import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MotoHomeComponent } from './moto-home.component';

describe('MotoHomeComponent', () => {
  let component: MotoHomeComponent;
  let fixture: ComponentFixture<MotoHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MotoHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MotoHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

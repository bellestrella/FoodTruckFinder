import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodTruckApplComponent } from './food-truck-appl.component';

describe('FoodTruckApplComponent', () => {
  let component: FoodTruckApplComponent;
  let fixture: ComponentFixture<FoodTruckApplComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FoodTruckApplComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodTruckApplComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { FoodTurckService } from './food-truck.service';


describe('FoodTurckService', () => {
  let service: FoodTurckService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FoodTurckService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

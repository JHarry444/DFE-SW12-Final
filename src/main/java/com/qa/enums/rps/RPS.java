package com.qa.enums.rps;

public enum RPS {

	ROCK {
		@Override
		public Result beats(RPS opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == SCISSORS)
				return Result.WIN;
			else if (opponent == PAPER)
				return Result.LOSE;
			else
				return null;
		}
	},
	PAPER {
		@Override
		public Result beats(RPS opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == ROCK)
				return Result.WIN;
			else if (opponent == SCISSORS)
				return Result.LOSE;
			else
				return null;
		}
	},
	SCISSORS {
		@Override
		public Result beats(RPS opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == PAPER)
				return Result.WIN;
			else if (opponent == ROCK)
				return Result.LOSE;
			else
				return null;
		}
	};

	public abstract Result beats(RPS opponent);
}

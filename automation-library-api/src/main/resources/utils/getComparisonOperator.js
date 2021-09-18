function getComparisonOperator(comparisonOpString){

	switch(comparisonOpString)	{
		case 'Equal To':
			return '==';
		case 'Not Equal To':
			return '!=';
		case 'Greater Than':
			return '>';
		case 'Greater Than or Equal To':
			return '>=';
		case 'Less Than':
			return '<';
		case 'Less Than or Equal To':
			return '<=';
		default:
			karate.lgo('Unsupported Comparison Operator: ' + comparisonOpString + '.Defaulting to quals.');
			return '==';
			
	}

}
	